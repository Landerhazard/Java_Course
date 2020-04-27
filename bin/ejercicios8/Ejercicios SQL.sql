/* Ejercicio 1*/
Select * from empleadoss_departamentoss.empleados;

/* Ejercicio 2*/
Select * from empleadoss_departamentoss.departamentos;

/* Ejercicio 3*/
Select * 
	from empleadoss_departamentoss.empleados 
	where cargoE = "Secretaria";
    
/* Ejercicio 4*/
Select nomEmp, salEmp from empleadoss_departamentoss.empleados;

/* Ejercicio 5*/
Select * 
	from empleadoss_departamentoss.empleados 
	where cargoE = "Vendedor"
    order By nomEmp;

/* Ejercicio 6*/
Select distinct nombreDpto from empleadoss_departamentoss.departamentos;

/* Ejercicio 7*/
Select nomEmp, cargoE 
	from empleadoss_departamentoss.empleados 
    order By salEmp;

/* Ejercicio 8*/
select nomEmp, salEmp, comisionE
	from empleadoss_departamentoss.empleados
    where codDepto = 2000;

/* Ejercicio 9*/
select nomEmp, comisionE from empleadoss_departamentoss.empleados;

/* Ejercicio 10*/
select (salEmp + comisionE) as "Total", nomEmp, codDepto
	from empleadoss_departamentoss.empleados
    where codDepto = 3000;

/* Ejercicio 11*/
select nomEmp
	from empleadoss_departamentoss.empleados
    where comisionE > salEmp;

/* Ejercicio 12*/
select nomEmp
	from empleadoss_departamentoss.empleados
	where comisionE <= salEmp * 0.3;

/* Ejercicio 13*/
select  concat("Nombre: ", nomEmp)  AS Name, concat("Cargo: ", cargoE)  AS Cargo 
	from empleadoss_departamentoss.empleados;
    
/* Ejercicio 14*/
select salEmp, comisionE
	from empleadoss_departamentoss.empleados
    where nDIEmp > "19709802";

/* Ejercicio 15*/
select (salEmp + comisionE) as Total, nDIEmp, nomEmp
	from empleadoss_departamentoss.empleados
    where comisionE > 1000000
    order by nDIEmp;

/* Ejercicio 16*/
select nomEmp
	from empleadoss_departamentoss.empleados
    where nomEmp like "%Ma%";

/* Ejercicio 17*/
select distinct nombreDpto
	from empleadoss_departamentoss.departamentos
    where nombreDpto<>'VENTAS' and nombreDpto<>'INVESTIGACIÓN' and nombreDpto<>'MANTENIMIENTO';

/* Ejercicio 18*/
select nomEmp
	from empleadoss_departamentoss.empleados
	where length(nomEmp) = 11;

/* Ejercicio 20*/
select *
	from empleadoss_departamentoss.empleados, empleadoss_departamentoss.departamentos
    where empleadoss_departamentoss.empleados.codDepto = empleadoss_departamentoss.departamentos.codDepto and 
    nomEmp like "M%" and (salEmp > 800000 or (comisionE > 0 and nombreDpto = "VENTAS"));

/* Ejercicio 22*/
select comisionE distict, count(comisionE) as Cantidad
	from empleadoss_departamentoss.empleados
    where comisionE is not null
    group by comisionE
    order by comisionE;

/* Ejercicio 23*/
CREATE SCHEMA `ejemplo_base_datos`;
use `ejemplo_base_datos`;
CREATE TABLE `ejemplo_base_datos`.`mitabla` (
  `idnew_table` INT NOT NULL,
  `nombre` VARCHAR(45) NOT NULL,
  `fechanacimiento` DATETIME NOT NULL,
  PRIMARY KEY (`idnew_table`));
use `ejemplo_base_datos` ;