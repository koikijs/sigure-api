# Resource Design

## Attendance Domain

### Default Attendance
| PK    | Required  | Name              | Logical Name              | Type      |
|:-----:|:---------:|------------------:|--------------------------:|----------:|
| O     | O         | id                | ID of default attendance  | UUID      |
|       | O         | personId          | ID of person              | UUID      |
|       | O         | timeZone          | default time zone         | string    |
|       | O         | localStartTime    | default start date        | string    |
|       | O         | localEndTime      | default end date          | string    |

### Attendance Modifier
| PK    | Required  | Name                  | Logical Name                  | Type      |
|:-----:|:---------:|----------------------:|------------------------------:|----------:|
| O     | O         | id                    | ID of attendance modifier     | UUID      |
|       | O         | defaultAttendanceId   | ID of default attendance      | UUID      |
|       | O         | reasonId              | ID of reason                  | UUID      |
|       | O         | date                  | modifier target date          | string    |
|       | O         | timeZone              | modified time zone            | string    |
|       |           | localStartTime        | modified attendance           | string    |
|       |           | localEndTime          | modified attendance           | string    |

### Reason
| PK    | Required  | Name                  | Logical Name      | Type                  |
|:-----:|:---------:|----------------------:|------------------:|----------------------:|
| O     | O         | id                    | ID of reason      | UUID                  |
|       | O         | message               | reason message    | map<string, string>   |
