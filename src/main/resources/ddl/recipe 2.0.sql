drop table if exists recipe_tags;
drop table if exists recipe_steps;
drop table if exists recipe_ingredients;
drop table if exists pantry;
drop table if exists ingredient;
drop table if exists step;
drop table if exists recipe;
drop table if exists tag;
drop table if exists quantity;
drop table if exists uom;
drop table if exists item;

create table item (
    id int not null auto_increment,
    name nvarchar(255) not null unique,
    primary key (id)
);
create table uom (
    id int not null auto_increment,
    name nvarchar(255) not null unique,
    abbreviation nvarchar(255) not null unique,
    primary key (id)
);
create table tag(
    id int not null auto_increment,
    name nvarchar(255) not null,
    primary key (id)
);
create table recipe(
    id int not null auto_increment,
    name nvarchar(255) not null unique,
    description nvarchar(255),
    primary key(id)
);
create table step(
    id int not null auto_increment,
    step_order int,
    text nvarchar(255),
    primary key(id)
);
create table ingredient(
    id int not null auto_increment,
    item_id int,
    quantity nvarchar(10) not null,
    uom_id int,
    primary key(id),
    foreign key (item_id) references item(id),
    foreign key (uom_id) references uom(id)
);
create table pantry(
    id int not null auto_increment,
    item_id int,
    uom_id int,
    quantity nvarchar(10) not null,
    primary key(id),
    foreign key (item_id) references item(id),
    foreign key (uom_id) references uom(id)
);
create table recipe_ingredients(
    recipe_id int,
    ingredient_id int,
    constraint recipe_ingredients_pk primary key (recipe_id,ingredient_id),
    foreign key (recipe_id) references recipe(id),
    foreign key (ingredient_id) references ingredient(id)
);
create table recipe_steps(
    recipe_id int,
    step_id int,
    constraint recipe_steps_pk primary key (recipe_id,step_id),
    foreign key (recipe_id) references recipe(id),
    foreign key (step_id) references step(id)
);
create table recipe_tags(
    recipe_id int,
    tag_id int,
    constraint recipe_tags_pk primary key (recipe_id,tag_id),
    foreign key (recipe_id) references recipe(id),
    foreign key (tag_id) references tag(id)
);

insert into item(name) values('garlic, clove');
insert into item(name) values('chicken, breast');
insert into item(name) values('chicken, thigh');
insert into item(name) values('ground beef');
insert into item(name) values('onion');
insert into item(name) values('vinegar');
insert into item(name) values('red wine vinegar');
insert into item(name) values('cider vinegar');
insert into item(name) values('salt');
insert into item(name) values('pepper');
insert into item(name) values('red pepper flakes');
insert into item(name) values('oil');
insert into item(name) values('oil, coconut');
insert into item(name) values('oil, peanut');
insert into item(name) values('oil, olive');
insert into item(name) values('oil, vegetable');
insert into item(name) values('tomato, grape');
insert into item(name) values('basil, leaves');
insert into item(name) values('basil, dried');

insert into uom(name, abbreviation) values('teaspoon','tsp');
insert into uom(name, abbreviation) values('tablespoon','tbsp');
insert into uom(name, abbreviation) values('cup','c');
insert into uom(name, abbreviation) values('pint','pt');
insert into uom(name, abbreviation) values('ounce','oz');
insert into uom(name, abbreviation) values('quart','qt');
insert into uom(name, abbreviation) values('gallon','gal');
insert into uom(name, abbreviation) values('pound','lb');
insert into uom(name, abbreviation) values('empty','');

insert into recipe(name) values('tomato salad');

insert into ingredient(item_id, quantity, uom_id) values(17,'1',3);
insert into ingredient(item_id, quantity, uom_id) values(12,'1',1);
insert into ingredient(item_id, quantity, uom_id) values(8,'1',1);
insert into ingredient(item_id, quantity, uom_id) values(18,'2',9);
insert into ingredient(item_id, quantity, uom_id) values(9,'1/8',1);
insert into ingredient(item_id, quantity, uom_id) values(10,'1/8',1);

insert into recipe_ingredients(recipe_id,ingredient_id) values(1,1);
insert into recipe_ingredients(recipe_id,ingredient_id) values(1,2);
insert into recipe_ingredients(recipe_id,ingredient_id) values(1,3);
insert into recipe_ingredients(recipe_id,ingredient_id) values(1,4);
insert into recipe_ingredients(recipe_id,ingredient_id) values(1,5);
insert into recipe_ingredients(recipe_id,ingredient_id) values(1,6);


select r.name as recipe, item.name as item, i.quantity, u.abbreviation from recipe r, ingredient i, recipe_ingredients ri, item item, uom u
where r.id = ri.recipe_id 
and i.id = ri.ingredient_id
and i.item_id = item.id
and u.id = i.uom_id;
