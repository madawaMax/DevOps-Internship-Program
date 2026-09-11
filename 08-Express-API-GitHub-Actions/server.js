const express = require("express");

const app = express();
const PORT = 3000;

app.get("/", (req, res) => {
  res.json({
    message: "Hello from Express API"
  });
});

app.get("/health", (req, res) => {
  res.json({
    status: "UP"
  });
});

if (require.main === module) {
  app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
  });
}

module.exports = app;
