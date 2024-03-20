import io from "socket.io-client";

const URL = 'ws://quiz-be-qc9k.onrender.com:9090';
export const socket = io(URL, {
  autoConnect: false,
  transports: ["websocket"],
});
