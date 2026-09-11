const request = require("supertest");
const app = require("./server");

describe("Express API Tests", () => {
  test("GET / should return welcome message", async () => {
    const response = await request(app).get("/");

    expect(response.statusCode).toBe(200);
    expect(response.body.message).toBe("Hello from Express API");
  });

  test("GET /health should return UP status", async () => {
    const response = await request(app).get("/health");

    expect(response.statusCode).toBe(200);
    expect(response.body.status).toBe("UP");
  });
});
