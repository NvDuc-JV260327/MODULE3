CREATE DATABASE IF NOT EXISTS session13;
USE session13;

-- tạo bảng students
CREATE TABLE IF NOT EXISTS students(
	student_id INT PRIMARY KEY AUTO_INCREMENT,
    full_name VARCHAR(100) NOT NULL,
    date_of_birth DATE NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE
);

-- procedure lấy all sinh viên
DELIMITER //

CREATE PROCEDURE get_all_students() 
BEGIN
	SELECT * FROM students;
END //

DELIMITER ;

-- thêm mới sinh viên
DELIMITER //

CREATE PROCEDURE add_student(
	IN in_full_name VARCHAR(100), 
	IN in_date_of_birth DATE, 
	IN in_email VARCHAR(100)
)
BEGIN
	INSERT INTO students(student_id, full_name, date_of_birth, email)
    VALUES(in_full_name, in_date_of_birth, in_email);
END //

DELIMITER ;

-- update sinh viên
DELIMITER //

CREATE PROCEDURE update_students(
	IN in_id INT,
    IN in_full_name VARCHAR(100),
    IN in_date_of_birth DATE,
    IN in_email VARCHAR(100)
)
BEGIN
	UPDATE students
	SET 
		full_name = in_full_name,
        date_of_birth = in_date_of_birth,
        email = in_email
	WHERE id = in_id;
END //

DELIMITER ;

-- tìm kiếm sinh viên
DELIMITER //

CREATE PROCEDURE find_student_by_id (IN in_id INT) 
BEGIN
	SELECT * FROM students
    WHERE id = in_id;
END //

DELIMITER ;

-- xóa 1 sinh viên
DELIMITER //
CREATE PROCEDURE delete_student(IN in_id INT)
BEGIN
	DELETE FROM students
    WHERE id = in_id;
END //

DELIMITER ;