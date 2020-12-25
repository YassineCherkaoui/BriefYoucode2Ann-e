-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 25, 2020 at 07:37 PM
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
-- Database: `gestionpersonnel`
--

-- --------------------------------------------------------

--
-- Table structure for table `manutentionnaire`
--

CREATE TABLE `manutentionnaire` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `nbrHeurs` int(11) NOT NULL,
  `salaire_Manut` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manutentionnaire`
--

INSERT INTO `manutentionnaire` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `nbrHeurs`, `salaire_Manut`) VALUES
(1, 'ahmed', 'said', 33, '20/02/2009', 120, 6000);

-- --------------------------------------------------------

--
-- Table structure for table `manutentionnaire_arisque`
--

CREATE TABLE `manutentionnaire_arisque` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `nbrHeurs` int(11) NOT NULL,
  `salaire_Manut_arisque` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `manutentionnaire_arisque`
--

INSERT INTO `manutentionnaire_arisque` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `nbrHeurs`, `salaire_Manut_arisque`) VALUES
(1, 'ZZZZZZ', 'ZZZ', 33, '20/12/2018', 120, 6200);

-- --------------------------------------------------------

--
-- Table structure for table `producteur`
--

CREATE TABLE `producteur` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `nbrUnites` int(11) NOT NULL,
  `salaire_prod` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `producteur`
--

INSERT INTO `producteur` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `nbrUnites`, `salaire_prod`) VALUES
(1, 'Aboulfateh', 'Lboooot', 30, '20/10/2019', 300, 1500),
(2222, 'AHHHHA', 'SDS', 23, '30/30/2019', 450, 1110),
(22, 'ZZ', 'EE', 22, '44', 23, 115),
(10, 'YASSINEE', 'CHERKAOUI', 20, '2000', 100, 500);

-- --------------------------------------------------------

--
-- Table structure for table `producteur_arisque`
--

CREATE TABLE `producteur_arisque` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `nbrUnites` int(11) NOT NULL,
  `salaire_prod_arisque` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `producteur_arisque`
--

INSERT INTO `producteur_arisque` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `nbrUnites`, `salaire_prod_arisque`) VALUES
(1, 'ABOULFATEH', 'ZAKARIA', 22, '20/20/2000', 400, 2200);

-- --------------------------------------------------------

--
-- Table structure for table `representant`
--

CREATE TABLE `representant` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `chiffreAffaire` double NOT NULL,
  `salaire_rep` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `representant`
--

INSERT INTO `representant` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `chiffreAffaire`, `salaire_rep`) VALUES
(45, 'ZAAA', 'SSSS', 23, '20/09/2009', 2330, 2966);

-- --------------------------------------------------------

--
-- Table structure for table `vendeur`
--

CREATE TABLE `vendeur` (
  `id` int(11) NOT NULL,
  `lastName` varchar(12) NOT NULL,
  `firstName` varchar(12) NOT NULL,
  `age` int(11) NOT NULL,
  `dateEntreeService` varchar(12) NOT NULL,
  `chiffreAffaire` double NOT NULL,
  `salaire_vendeur` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `vendeur`
--

INSERT INTO `vendeur` (`id`, `lastName`, `firstName`, `age`, `dateEntreeService`, `chiffreAffaire`, `salaire_vendeur`) VALUES
(111, 'ZZZZ', 'ZZZ', 22, '2000/20/20', 2090, 1918);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
