# Database Versioning with Temporal Tables

This document outlines how to create and manage temporal tables in a database, track data changes over time, and handle updates with system versioning.

## 1. Table Creation

### Creating the `Service` Table

The `Service` table stores information about the different subscription services offered. This table is versioned, meaning that every change to its rows is automatically recorded with a timestamp.

```sql
CREATE TABLE Service (
    service_id INT PRIMARY KEY,
    service_name VARCHAR(100),
    price_per_day DECIMAL(10,2),
    TransactionStartTime TIMESTAMP(6) GENERATED ALWAYS AS ROW START,
    TransactionEndTime TIMESTAMP(6) GENERATED ALWAYS AS ROW END,
    PERIOD FOR SYSTEM_TIME (TransactionStartTime, TransactionEndTime)
) WITH SYSTEM VERSIONING;
```
