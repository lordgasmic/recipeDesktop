create user 'recipe_admin'@'localhost' identified by 'recipe_admin';
create user 'recipe_appl'@'%' identified by 'recipe_appl';
grant all PRIVILEGES on recipe.* to 'recipe_admin'@'localhost';
grant SELECT, INSERT, UPDATE, DELETE on recipe.* to 'recipe_appl'@'%';