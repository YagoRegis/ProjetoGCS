-- phpMyAdmin SQL Dump
-- version 3.4.10.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 10, 2013 at 05:37 PM
-- Server version: 5.5.31
-- PHP Version: 5.3.10-1ubuntu3.6

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `helpdesk`
--

-- --------------------------------------------------------

--
-- Table structure for table `chamado`
--

CREATE TABLE IF NOT EXISTS `chamado` (
  `cod` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_cod` int(11) NOT NULL,
  `usuario_login` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `descricao` varchar(250) CHARACTER SET utf8 NOT NULL,
  `data_inicial` varchar(50) DEFAULT NULL,
  `data_final` varchar(50) DEFAULT NULL,
  `patrimonio_equip` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `localizacao_equip` varchar(20) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `login_tecnico` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `chamado`
--

INSERT INTO `chamado` (`cod`, `tipo_cod`, `usuario_login`, `descricao`, `data_inicial`, `data_final`, `patrimonio_equip`, `localizacao_equip`, `login_tecnico`) VALUES
(3, 2, 'andrecruz', 'Conserto de uma tomada na sala 230', '2013-07-10T17:36:41.539-03:00', '2013-07-10T17:36:41.539-03:00', '123', 'forum', 'model.Usuario@3487a5cc');

-- --------------------------------------------------------

--
-- Table structure for table `solucao`
--

CREATE TABLE IF NOT EXISTS `solucao` (
  `cod` int(11) NOT NULL AUTO_INCREMENT,
  `chamado_cod` int(11) NOT NULL,
  `descricao` varchar(250) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `data_solucao` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `status`
--

CREATE TABLE IF NOT EXISTS `status` (
  `cod` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(25) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`cod`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `tipo_chamado`
--

CREATE TABLE IF NOT EXISTS `tipo_chamado` (
  `cod` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(25) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`cod`),
  UNIQUE KEY `descricao` (`descricao`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE IF NOT EXISTS `usuario` (
  `login` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `senha` varchar(8) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(30) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `nome` varchar(50) CHARACTER SET utf8 COLLATE utf8_unicode_ci NOT NULL,
  `matricula` int(11) NOT NULL,
  PRIMARY KEY (`login`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`login`, `senha`, `email`, `nome`, `matricula`) VALUES
('and1412', '123456', 'andrelink14@hotmail.com', 'andre', 90066626),
('andrecruz', '654321', 'andrelink14@hotmail.com', 'andre', 90066626);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
