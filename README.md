# 📚 Spring Boot Student & Course CRUD API

This project is a RESTful API built with **Spring Boot**, allowing CRUD operations on `Student` and `Course` models using generic inheritance via a base controller.

---

## 📦 Project Structure

```
src/
└── main/
    └── java/
        └── com/backend/Backend/
            ├── Controller/
            │   ├── CRUDController.java
            │   ├── AppController.java
            │   └── CourseController.java
            └── model/
                ├── Student.java
                └── Course.java
```

---

## 🚀 Getting Started

### ✅ Requirements

- Java 17+
- Maven 3.6+
- Spring Boot 3.x

### ▶️ Run the App

```bash
./mvnw spring-boot:run
```

The application will run on:  
**http://localhost:8080**

---

## 🧪 API Endpoints

### 👨‍🎓 Student

- `GET /students/` – Get all students  
- `GET /students/{id}` – Get student by ID  
- `POST /students/add/{id}` – Add new student  
- `PUT /students/update/{id}` – Update existing student  
- `DELETE /students/delete/{id}` – Delete student  

### 📘 Course

- `GET /course/` – Get all courses  
- `GET /course/{id}` – Get course by ID  
- `POST /course/add/{id}` – Add new course  
- `PUT /course/update/{id}` – Update existing course  
- `DELETE /course/delete/{id}` – Delete course  

---

## 🧰 Technologies Used

- Spring Boot  
- Spring Web (REST Controller)  
- Java 17  
- Maven



## 💡 Design

This project uses a generic `CRUDController<K, T>` class that is extended by other controllers like `CourseController` and `AppController` to manage entities.

---

## 📝 License

[MIT License](https://opensource.org/licenses/MIT)  
© 2025 DInuki Prarthana

---

## ✍️ Author

Made with ❤️ by **Dinuki Prarthana**  
🔗 GitHub: [@Dinuki85](https://github.com/Dinuki85)
