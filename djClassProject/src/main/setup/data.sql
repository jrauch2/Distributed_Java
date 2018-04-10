/**
 * Author:  jmbra
 * Created: Mar 28, 2018
 */

drop table product;

create table product (
    productID varchar(6) primary key,
    productName varchar(50) not null,
    shortDescription varchar(100),
    longDescription varchar(500),
    image varchar(50),
    cost decimal(10,2),
    retail decimal(10,2),
    discount int,
    quantityOnHand int,
    quantityOnOrder int,
    discontinued boolean,
    sale boolean
);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100001','Peeler','A peeler.','A peeler featuring an ergonomic handle, perfect for peeling potatoes, apples, and all of your peeling needs.','images/peeler.png',1.70,4.99,0,10,0,false,false);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100002','Can Opener','Stainless steel can opener.','A standard, stainless steel can opener.','images/canOpener.png',2.1,5.99,0,10,0,false,false);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100003','Spoon Rest','Decorative spoon rest.','A decorative spoon rest, designed to look like a sugar skull for Dia de los Muertos.','images/sugarSkullSpoonRest.png',2.7,7.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100004','Straining Spoon','A wooden straining spoon.','A wooden straining spoon, featuring holes to easily drain away liquid and scoop out your food.','images/woodenStrainingSpoon.png',.2,.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100005','Spoon','A wooden spoon.','A wooden spoon.','images/woodenSpoon.png',.2,.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100006','Tongs','Ergonomic tongs.','Tongs, featuring an ergonomic handle and locking mechanism to allow for easy storage.','images/tongs.png',1.1,5.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100007','Spatula','A wooden spatula.','A wooden spatula.','images/woodenSpatula.png',.1,.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100008','Masher','A masher.','A masher, featuing an ergonomic handle. Perfect for mashing potatoes, sweet potatoes, and all of your mashing needs.','images/masher.png',1,4.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100009','Measuring Cups','A set of metal measuring cups.','A set of meta measuring cups, including: 1 cup, 1/2 cup, 1/3 cup, and 1/4 cup.','images/measuringCups.png',1.4,3.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100010','Measuring Spoons','Decorative measuring spoons.','Decorative measuring spoons, designed to look like sugar skulls for Dia de los Muertos.','images/sugarSkullMeasuringSpoons.png',2.7,7.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100011','Cutter','A round cutter.','A round cutter, perfect for cutting pizza, dough, and all of your cutting needs.','images/pizzaCutter.png',1.9,4.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100012','Glass pitcher.','A glass pitcher with ornate handle.','A glass pitcher with beautiful, ornate, antique-looking handle.','images/pitcher.png',1.6,3.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100013','Wooden Set','A wooden spoon set.','A set of wooden utensils including: 1 spatula, 1 straining spoon, and 1 spoon.','images/woodenSpoonSet.png',.6,2.99,0,10,0,FALSE,FALSE);

insert into product (productID, productName, shortDescription, longDescription, image, cost, retail, discount, quantityOnHand, quantityOnOrder, discontinued, sale)
values ('100014','Whisk set','A set of metal whisks.','A set of metal whisks, size large and small.','images/whisks.png',1.9,3.99,0,10,0,FALSE,FALSE);