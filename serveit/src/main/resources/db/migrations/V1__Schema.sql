set search_path to mgz,public;

CREATE TABLE RESOURCES (
    id VARCHAR(50),
    name VARCHAR NOT NULL, -- kosiarka?
    owner VARCHAR(50), -- Janusz
    PRIMARY KEY (id)
)

-- resource availability
    -- from - to
    -- can be several periods
    -- status for availability
    -- place

-- saved search parameters
    -- give me all available resource

