
package com.devops;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;

public class App {

    public static String getMessage() {
        return "DEVOPS-059 Full CI/CD Pipeline is working!!5rd try";
    }

    public static String getHealthStatus() {
        return "UP";
    }

    public static void main(String[] args) throws IOException {

        HttpServer server = HttpServer.create(
                new InetSocketAddress(8081),
                0
        );

        server.createContext("/health", App::handleHealthCheck);

        server.start();

        System.out.println("Application started on port 8081");
        System.out.println("Health endpoint: http://localhost:8081/health");
    }

    private static void handleHealthCheck(HttpExchange exchange) throws IOException {

        String response = getHealthStatus();

        exchange.getResponseHeaders().set(
                "Content-Type",
                "text/plain"
        );

        exchange.sendResponseHeaders(
                200,
                response.getBytes().length
        );

        try (OutputStream outputStream = exchange.getResponseBody()) {
            outputStream.write(response.getBytes());
        }
    }
}

