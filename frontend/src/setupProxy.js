const { createProxyMiddleware } = require('http-proxy-middleware');

module.exports = function(app) {
  app.use(createProxyMiddleware("/api/**", { target: "https://quiz-be-qc9k.onrender.com:8080" }));
  // app.use(createProxyMiddleware("/socket", { target: "ws://10.44.7.1:9090", ws: true, changeOrigin: true }));
};

