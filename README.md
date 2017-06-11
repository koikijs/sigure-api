# Resource Design
## Attendance Domain
### Default Attendance
| PK    | Name              | Logical Name              |
|:-----:|------------------:|--------------------------:|
| O     | id                | ID of default attendance  |
|       | personId          | ID of person              |
|       | timeZone          | default time zone         |
|       | localStartTime    | default start date        |
|       | localEndTime      | default end date          |

### Attendance Modifier
| PK    | Name                  | Logical Name                  |
|:-----:|----------------------:|------------------------------:|
| O     | id                    | ID of attendance modifier     |
|       | defaultAttendanceId   | ID of default attendance      |
|       | date                  | modifier target date          |
|       | timeZone              | modified time zone            |
|       | localStartTime        | modified attendance           |
|       | localEndTime          | modified attendance           |
