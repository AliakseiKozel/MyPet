CREATE TABLE IF NOT EXISTS films(
    id INTEGER AUTO_INCREMENT primary key,
    name VARCHAR(40) NOT NULL,
    description VARCHAR(1000) NOT NULL
);

CREATE TABLE IF NOT EXISTS comment(
   id INTEGER AUTO_INCREMENT primary key,
   text VARCHAR(1000),
   mark INTEGER,
   filmId INTEGER,
   foreign key (filmId) REFERENCES films (id)
);