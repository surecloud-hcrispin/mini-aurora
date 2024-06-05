FROM postgres:2.24.5

# Set environment variables
ENV POSTGRES_DB=aurora-mini-db
ENV POSTGRES_USER=postgres
ENV POSTGRES_PASSWORD=postgres

EXPOSE 5432