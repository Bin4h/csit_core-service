CREATE TABLE "student" (
  "id" serial PRIMARY KEY,
  "name" varchar(255) NOT NULL,
  "email" text DEFAULT NULL
);
INSERT INTO "student" ("name", "email")
VALUES
    ('Sergey', 'aboba@mail.ru');