Jag ska göra ett spel där man kan mäta hur fort man kan trycka space och spara det i en fil, och spara en leaderboard i en databas. Man ska även kunna 1v1a varandra och sen spara sitt egna score i en fil eller på leaderboarden.

## databas


| Tables_in_leaderboard |
|-----------------------|
| id                    |
| name                  |
| score                 |

| Field | Type            | Null | Key | Default | Extra          |
|-------|-----------------|------|-----|---------|----------------|
| id    | bigint unsigned | NO   | PRI | NULL    | auto_increment |

| Field | Type       | Null | Key | Default | Extra |
|-------|------------|------|-----|---------|-------|
| name  | varchar(3) | YES  |     | NULL    |       |

| Field | Type   | Null | Key | Default | Extra |
|-------|--------|------|-----|---------|-------|
| score | double | YES  |     | NULL    |       |
