USE  session15;

CREATE TABLE Product(
    product_id INT PRIMARY KEY AUTO_INCREMENT ,
    product_name VARCHAR(100) NOT NULL UNIQUE ,
    product_price FLOAT NOT NULL CHECK ( product_price > 0 ) ,
    product_title VARCHAR(200) NOT NULL ,
    product_created DATE NOT NULL ,
    product_catalog VARCHAR(100) NOT NULL ,
    product_status BIT DEFAULT 1
);

INSERT INTO Product (product_name, product_price, product_title, product_created, product_catalog, product_status)
VALUES
    ('IPHONE_15_PRO', 28990000, 'Điện thoại Apple iPhone 15 Pro 128GB - Chính hãng VN/A', '2024-01-15', 'Điện thoại', 1),
    ('MACBOOK_AIR_M2', 26490000, 'Laptop Apple MacBook Air M2 2022 (8GB/256GB)', '2024-01-20', 'Laptop', 1),
    ('SAMSUNG_S24_ULTRA', 31990000, 'Điện thoại Samsung Galaxy S24 Ultra 12GB/256GB', '2024-02-01', 'Điện thoại', 1),
    ('SONY_WH1000XM5', 8490000, 'Tai nghe chụp tai chống ồn Sony WH-1000XM5', '2024-02-10', 'Phụ kiện', 1),
    ('IPAD_AIR_5', 14990000, 'Máy tính bảng iPad Air 5 Wi-Fi 64GB', '2024-02-12', 'Máy tính bảng', 1),
    ('LOGITECH_MX_MASTER_3S', 2490000, 'Chuột không dây Logitech MX Master 3S', '2024-02-15', 'Phụ kiện', 1),
    ('DELL_ULTRASHARP_U2723QE', 12890000, 'Màn hình Dell UltraSharp 27 inch 4K U2723QE', '2024-02-18', 'Màn hình', 1),
    ('LG_GRAM_14_2023', 21990000, 'Laptop LG Gram 14 inch Intel Core i5 (8GB/512GB)', '2024-02-20', 'Laptop', 0),
    ('APPLE_WATCH_SERIES_9', 10490000, 'Đồng hồ thông minh Apple Watch Series 9 GPS 41mm', '2024-02-22', 'Thiết bị đeo', 1),
    ('KEYCHRON_K2_V2', 1890000, 'Bàn phím cơ không dây Keychron K2 V2 Aluminum', '2024-02-25', 'Phụ kiện', 1);

DELIMITER //

CREATE PROCEDURE get_all_products()
BEGIN
    SELECT product_id,product_name, product_price, product_title, product_created, product_catalog, product_status
    FROM Product;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE add_product(
    IN in_name VARCHAR(100),
    IN in_price FLOAT,
    IN in_title VARCHAR(200),
    IN in_created DATE,
    IN in_catalog VARCHAR(100),
    IN in_status BIT
)
BEGIN
    INSERT INTO Product(product_name, product_price, product_title, product_created, product_catalog, product_status)
    VALUES (in_name, in_price, in_title, in_created, in_catalog, in_status);
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE update_product(
    IN in_product_id INT,
    IN in_product_name VARCHAR(100),
    IN in_product_price FLOAT,
    IN in_product_title VARCHAR(200),
    IN in_product_created DATE,
    IN in_catalog VARCHAR(100),
    IN in_status BIT
)
BEGIN
    UPDATE Product
    SET
        product_name = in_product_name,
        product_price = in_product_price,
        product_title = in_product_title,
        product_created = in_product_created,
        product_catalog = in_catalog,
        product_status = in_status
    WHERE product_id = in_product_id;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE delete_product(IN delete_id INT)
BEGIN
    DELETE FROM Product
    WHERE product_id = delete_id;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE find_by_name(IN find_name VARCHAR(100))
BEGIN
    SELECT product_id, product_name, product_price, product_title, product_created, product_catalog, product_status
    FROM Product
    WHERE product_name LIKE CONCAT('%', find_name, '%') ;
END //

DELIMITER ;

DELIMITER //

CREATE PROCEDURE product_by_catalog()
BEGIN
    SELECT product_catalog AS "Catalog", COUNT(product_catalog) AS "Total"
    FROM product
    GROUP BY product_catalog;
END //

DELIMITER ;
