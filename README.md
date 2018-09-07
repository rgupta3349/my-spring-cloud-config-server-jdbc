# my-spring-cloud-config-server-jdbc

this config server use database mysql as env reposiroty to store configuration

spring profile jdbc do auto config for jdbc, mentioned mysql properties in yml file

In yml file also 

MYSQL statement(KEY is reserved word in MYSQL so use backtick). also in yml file give spring.cloud.config.server.jdbc.sql statement  

CREATE TABLE IF NOT EXISTS PROPERTIES(
    `KEY` VARCHAR(255),
    VALUE VARCHAR(255),
    APPLICATION VARCHAR(255),
    PROFILE VARCHAR(255),
    LABEL VARCHAR(255)
)  ENGINE=INNODB;
