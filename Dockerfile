FROM postgres:latest

# Set environment variables
ENV POSTGRES_DB=Mini-Aurora
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres

EXPOSE 5432