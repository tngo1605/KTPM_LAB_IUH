# Dùng Node bản nhẹ
FROM node:20-alpine

# Tạo thư mục app
WORKDIR /app

# Biến môi trường
ENV NODE_ENV=production

# Copy package trước để cache layer
COPY package*.json ./

# Cài dependency (chỉ production)
RUN npm ci --omit=dev

# Copy toàn bộ source code
COPY . .

# Port app
EXPOSE 3000

# Chạy server
CMD ["node", "src/index.js"]