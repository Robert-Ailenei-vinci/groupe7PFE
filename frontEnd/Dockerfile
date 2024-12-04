# Étape de build
FROM node:14-alpine AS build
WORKDIR /frontEnd
COPY package*.json ./
RUN npm install
COPY . .
RUN npm run build --prod

# Étape de production
FROM nginx:alpine
COPY --from=build /frontEnd/dist/front-end /usr/share/nginx/html
EXPOSE 80
CMD ["nginx", "-g", "daemon off;"]
