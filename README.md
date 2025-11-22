# Job Board REST API

A comprehensive backend REST API designed for a recruitment or job board platform. Built using **Java Spring Boot** and **PostgreSQL**, this project serves as the core service for managing job advertisements.

## Tech Stack
* **Java 17+**
* **Spring Boot** (Web, Data JPA)
* **PostgreSQL** (Database)
* **Maven** (Build Tool)

## Key Features
* **CRUD Operations:** Full capability to Create, Read, Update, and Delete job posts.
* **Smart Search:** Search for jobs dynamically using keywords (`/jobPosts/keyword/{keyword}`).
* **Frontend Ready:** Configured with CORS to communicate seamlessly with frontend apps (e.g., React running on port 3000).
* **Database Integration:** Persistent storage using PostgreSQL.
* **Data Loader:** Includes a utility endpoint to load initial dummy data for testing.

## API Endpoints
* `GET /jobPosts`: Fetch all available jobs.
* `GET /jobPosts/{id}`: Get details of a specific job.
* `POST /jobPost`: Add a new job listing.
* `PUT /jobPost`: Update an existing job.
* `DELETE /jobPost/{id}`: Remove a job listing.
* `GET /jobPosts/keyword/{text}`: Search jobs by specific terms.
