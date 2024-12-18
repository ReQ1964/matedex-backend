INSERT INTO yerba (id, name, description, company, rating, bitterness, dust, power, image_data)
VALUES
    (1, 'Rosamonte',
     'Rosamonte is a traditional Argentinian yerba mate brand known for its strong and robust flavor. It is perfect for those who enjoy a bold mate experience.',
     'Rosamonte',
     4, 3, 2, 4, NULL);

INSERT INTO reviews (id, author, rating, review, yerba_id)
VALUES
    (1, 'John Doe', 5, 'Great product, highly recommended!', 1),
    (2, 'Jane Smith', 4, 'Good quality, but a bit strong for my taste.', 1);
