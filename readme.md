# Basic Inventory Management API

Project created for learning purposes.

## Technology
- Docker
- MongoDB
- Kotlin Spring API
- React/TypeScript

## MongoDB Setup

1. Modify `.env.template` file to your liking
2. Rename file to `.env`

## Kotlin Backend Setup

1. Modify `application.properties.template` file to match previous settings for MongoDB setup
2. Rename to `application.properties`
3. Run `./gradlew bootBuildImage` to create Docker Image

## Docker

1. Run `docker-compose` command
2. Verify Mongo-Express is accessible via browser
3. Verify Kotlin Backend via Postman