# Note Taker 

## Description
The **Note Taker ** is a web-based application that allows users to create, edit, delete, and manage notes efficiently. It is built using **Java Servlets**, **JSP**, **Hibernate**, and **PostgreSQL**, with a responsive front-end powered by **Bootstrap**.

## Features
- User authentication (implementing)
- Create, edit, and delete notes
- View all saved notes in a user-friendly interface
- Responsive design with Bootstrap
- Data persistence using Hibernate with PostgreSQL

## Technologies Used
- **Frontend:** JSP, Bootstrap, HTML, CSS
- **Backend:** Java Servlets, Hibernate
- **Database:** PostgreSQL
- **Server:** Apache Tomcat

## Installation & Setup
### Prerequisites
- JDK 8 or later
- Apache Tomcat
- PostgreSQL Database
- Maven (for dependency management)

### Steps to Run
1. Clone the repository:
   ```sh
   git clone https://github.com/your-username/note-taker-app.git
   ```
2. Configure the PostgreSQL database:
   ```sql
   CREATE DATABASE note_taker;
   ```
3. Update the `hibernate.cfg.xml` with your database credentials.
4. Build and deploy the project on Tomcat.
5. Access the app at `http://localhost:8080/NoteTaker/index.jsp`

## License
This project is open-source and available under the MIT License.
