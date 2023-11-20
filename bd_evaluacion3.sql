-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 21-11-2023 a las 00:00:02
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_evaluacion3`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala1`
--

CREATE TABLE `sala1` (
  `ID` int(11) NOT NULL,
  `S1_DIA_HORA` varchar(20) DEFAULT NULL,
  `DISPONIBILIDAD` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sala1`
--

INSERT INTO `sala1` (`ID`, `S1_DIA_HORA`, `DISPONIBILIDAD`) VALUES
(1, 'lunes 8_10', 'Ocupado'),
(2, 'lunes10_12', 'Ocupado'),
(3, 'lunes12_14', 'Ocupado'),
(4, 'jbtn_lunes14_16', 'Ocupado'),
(5, 'lunes16_18', 'Ocupado'),
(6, 'martes8_10', 'Disponible'),
(7, 'martes10_12', 'Disponible'),
(8, 'martes12_14', 'Disponible'),
(9, 'martes14_16', 'Disponible'),
(10, 'martes16_18', 'Disponible'),
(11, 'miercoles 8_10 ', 'Disponible'),
(12, 'miercoles 10_12 ', 'Disponible'),
(13, 'miercoles12_14', 'Disponible'),
(14, 'miercoles14_16', 'Disponible'),
(15, 'miercoles16_18', 'Disponible'),
(16, 'jueves8_10', 'Disponible'),
(17, 'jueves10_12', 'Disponible'),
(18, 'jueves12_14', 'Disponible'),
(19, 'jueves14_16', 'Disponible'),
(20, 'jueves16_18', 'Disponible'),
(21, 'viernes 8_10 ', 'Disponible'),
(22, 'viernes 10_12 ', 'Disponible'),
(23, 'viernes 12_14 ', 'Disponible'),
(24, 'viernes 14_16 ', 'Disponible'),
(25, 'viernes 16_18 ', 'Disponible');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala2`
--

CREATE TABLE `sala2` (
  `ID` int(11) NOT NULL,
  `S2_DIA_HORA` varchar(20) DEFAULT NULL,
  `DISPONIBILIDAD` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sala2`
--

INSERT INTO `sala2` (`ID`, `S2_DIA_HORA`, `DISPONIBILIDAD`) VALUES
(1, 'lunes 8_10', 'Disponible'),
(2, 'lunes10_12', 'Disponible'),
(3, 'lunes12_14', 'Disponible'),
(4, 'lunes14_16', 'Disponible'),
(5, 'lunes16_18', 'Disponible'),
(6, 'martes8_10', 'Disponible'),
(7, 'martes10_12', 'Disponible'),
(8, 'martes12_14', 'Disponible'),
(9, 'martes14_16', 'Disponible'),
(10, 'martes16_18', 'Disponible'),
(11, 'miercoles8_10', 'Disponible'),
(12, 'miercoles10_12', 'Disponible'),
(13, 'miercoles12_14', 'Disponible'),
(14, 'miercoles14_16', 'Disponible'),
(15, 'miercoles16_18', 'Disponible'),
(16, 'jueves8_10', 'Disponible'),
(17, 'jueves10_12', 'Disponible'),
(18, 'jueves12_14', 'Disponible'),
(19, 'jueves14_16', 'Disponible'),
(20, 'jueves16_18', 'Disponible'),
(21, 'viernes8_10', 'Disponible'),
(22, 'viernes10_12', 'Disponible'),
(23, 'viernes12_14', 'Disponible'),
(24, 'viernes14_16', 'Disponible'),
(25, 'viernes16_18', 'Disponible');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sala3`
--

CREATE TABLE `sala3` (
  `ID` int(11) NOT NULL,
  `S3_DIA_HORA` varchar(20) DEFAULT NULL,
  `DISPONIBILIDAD` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `sala3`
--

INSERT INTO `sala3` (`ID`, `S3_DIA_HORA`, `DISPONIBILIDAD`) VALUES
(1, 'lunes 8_10 ', '1'),
(2, 'lunes 10_12 ', '0'),
(3, 'lunes 10_12 ', '0'),
(4, 'lunes 10_12 ', '0'),
(5, 'lunes 10_12 ', '0'),
(6, 'martes 8_10 ', '0'),
(7, 'martes 10_12 ', '0'),
(8, 'martes 12_14 ', '0'),
(9, 'martes 14_16 ', '0'),
(10, 'martes 16_18 ', '0'),
(11, 'miercoles 8_10 ', '0'),
(12, 'miercoles 10_12 ', '0'),
(13, 'miercoles 12_14 ', '0'),
(14, 'miercoles 14_16 ', '0'),
(15, 'miercoles 16_18 ', '0'),
(16, 'jueves 8_10 ', '0'),
(17, 'jueves 10_12 ', '0'),
(18, 'jueves 12_14 ', '0'),
(19, 'jueves 14_16 ', '0'),
(20, 'jueves 16_18 ', '0'),
(21, 'viernes 8_10 ', '0'),
(22, 'viernes 10_12 ', '0'),
(23, 'viernes 12_14 ', '0'),
(24, 'viernes 14_16 ', '0'),
(25, 'viernes 16_18 ', '0');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `RUT` varchar(20) NOT NULL,
  `NOMBRE` varchar(20) DEFAULT NULL,
  `CONTRASENA` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`RUT`, `NOMBRE`, `CONTRASENA`) VALUES
('1-9', 'Vgonzalez', '1234'),
('11', 'qwe', 'qwe'),
('123', '123', '123'),
('2', '2', '2'),
('333-3', 'ewans', 'ewans'),
('444-4', 'test2', '1234'),
('777-7', 'prueba3', 'prueba3'),
('999-9', '12341', 'SDFSWDF');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `sala1`
--
ALTER TABLE `sala1`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `sala2`
--
ALTER TABLE `sala2`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `sala3`
--
ALTER TABLE `sala3`
  ADD PRIMARY KEY (`ID`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`RUT`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
