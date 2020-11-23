-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 22, 2020 at 04:08 PM
-- Server version: 10.4.13-MariaDB
-- PHP Version: 7.4.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `restaubeldi`
--

-- --------------------------------------------------------

--
-- Table structure for table `buyer`
--

CREATE TABLE `buyer` (
  `ID` int(100) NOT NULL,
  `name` varchar(200) NOT NULL,
  `email` varchar(200) NOT NULL,
  `phone` int(250) NOT NULL,
  `addrss` varchar(200) NOT NULL,
  `time` datetime(6) NOT NULL DEFAULT current_timestamp(6),
  `p_name` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `buyer`
--

INSERT INTO `buyer` (`ID`, `name`, `email`, `phone`, `addrss`, `time`, `p_name`) VALUES
(14, 'Yassine', 'YASSIN@GMAIL.COM', 606060, 'N 31 Rue IDOUCHAINANE', '2020-11-21 22:51:29.043221', ''),
(15, 'Yassine', 'YASSIN@GMAIL.COM', 606060, 'N 31 Rue IDOUCHAINANE', '2020-11-21 22:51:54.858924', ''),
(16, 'Yassine', 'YASSIN@GMAIL.COM', 0, 'N 31 Rue IDOUCHAINANE', '2020-11-21 22:52:55.094913', ''),
(17, 'mohamed', 'mohamed@gmail.com', 2147483647, 'ksqjdlsufygslhfsdlvjchvlhcg', '2020-11-21 23:16:20.499497', ''),
(18, 'Yassine', 'yess@yess.com', 621114160, 'N 31 Rue IDOUCHAINANE', '2020-11-21 23:22:47.257889', ''),
(19, 'Yassine', 'YASSIN@GMAIL.COM', 0, 'N 31 Rue IDOUCHAINANE', '2020-11-22 13:19:35.669860', 'Name of the plat'),
(20, 'Yassine', 'YASSIN@GMAIL.COM', 621114160, 'N 31 Rue IDOUCHAINANE', '2020-11-22 13:24:39.105987', 'Name of the plat'),
(21, 'Yassine', 'YASSIN@GMAIL.COM', 621114160, 'N 31 Rue IDOUCHAINANE', '2020-11-22 14:01:42.240439', 'lhem'),
(22, 'Yassine', 'YASSIN@GMAIL.COM', 621114160, 'N 31 Rue IDOUCHAINANE', '2020-11-22 14:03:29.877254', 'lhem'),
(23, 'Yassine', 'YASSIN@GMAIL.COM', 621114160, 'N 31 Rue IDOUCHAINANE', '2020-11-22 14:03:47.177617', 'lhem');

-- --------------------------------------------------------

--
-- Table structure for table `plates`
--

CREATE TABLE `plates` (
  `id_plat` int(100) NOT NULL,
  `images` varchar(200) NOT NULL,
  `nom` varchar(200) NOT NULL,
  `prix` int(200) NOT NULL,
  `disc` varchar(200) NOT NULL,
  `jour` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `plates`
--

INSERT INTO `plates` (`id_plat`, `images`, `nom`, `prix`, `disc`, `jour`) VALUES
(1, 'p1.jpg', 'McDonald\'s', 20, 'Burgers • Fast-food • Américain', '2020-11-23'),
(2, 'p2.jpg', 'Le Dak Art', 20, 'Américain • Pâtes • Salades • Fast-food', '2020-11-22'),
(4, 'p3.jpg', 'Le 107', 20, 'Pâtes • Pizza • Poissons • Viandes • Italien', '2020-11-24'),
(5, 'p4.jpg', 'Tomy Food', 20, 'Burgers • Fast-food • Américain', '2020-11-25');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `buyer`
--
ALTER TABLE `buyer`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `plates`
--
ALTER TABLE `plates`
  ADD PRIMARY KEY (`id_plat`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `buyer`
--
ALTER TABLE `buyer`
  MODIFY `ID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- AUTO_INCREMENT for table `plates`
--
ALTER TABLE `plates`
  MODIFY `id_plat` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
