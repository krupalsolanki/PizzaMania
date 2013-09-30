-- phpMyAdmin SQL Dump
-- version 3.4.5
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 30, 2013 at 04:14 PM
-- Server version: 5.5.16
-- PHP Version: 5.3.8

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `pizzadb`
--

-- --------------------------------------------------------

--
-- Table structure for table `customizeitem`
--

CREATE TABLE IF NOT EXISTS `customizeitem` (
  `customizeitemid` int(2) NOT NULL AUTO_INCREMENT,
  `itemsizeid` int(2) NOT NULL,
  `menuitemid` int(2) NOT NULL,
  `quantity` int(2) NOT NULL,
  `netprice` decimal(5,2) NOT NULL,
  `extratoppingprice` int(2) NOT NULL,
  `totalprice` decimal(5,2) NOT NULL,
  `orderid` int(2) NOT NULL,
  PRIMARY KEY (`customizeitemid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `itemsize`
--

CREATE TABLE IF NOT EXISTS `itemsize` (
  `itemsizeid` int(2) NOT NULL AUTO_INCREMENT,
  `itemsize` varchar(50) NOT NULL,
  `itemsizeprice` int(3) NOT NULL,
  PRIMARY KEY (`itemsizeid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data for table `itemsize`
--

INSERT INTO `itemsize` (`itemsizeid`, `itemsize`, `itemsizeprice`) VALUES
(1, 'small', 50),
(2, 'medium', 100),
(3, 'large', 150);

-- --------------------------------------------------------

--
-- Table structure for table `itemtype`
--

CREATE TABLE IF NOT EXISTS `itemtype` (
  `itemtypeid` int(2) NOT NULL AUTO_INCREMENT,
  `menutypeid` int(2) NOT NULL,
  `itemtypename` varchar(50) NOT NULL,
  PRIMARY KEY (`itemtypeid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Dumping data for table `itemtype`
--

INSERT INTO `itemtype` (`itemtypeid`, `menutypeid`, `itemtypename`) VALUES
(1, 1, 'Simply Veg'),
(2, 1, 'Veg Treat'),
(3, 1, 'Simply Non-Veg'),
(4, 1, 'Non-Veg Treat');

-- --------------------------------------------------------

--
-- Table structure for table `menuitem`
--

CREATE TABLE IF NOT EXISTS `menuitem` (
  `menuitemid` int(3) NOT NULL AUTO_INCREMENT,
  `itemtypeid` int(3) NOT NULL,
  `itemname` varchar(50) NOT NULL,
  `itemprice` int(5) NOT NULL,
  `itemtoppings` varchar(250) NOT NULL,
  `imagesource` varchar(500) NOT NULL,
  PRIMARY KEY (`menuitemid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=13 ;

--
-- Dumping data for table `menuitem`
--

INSERT INTO `menuitem` (`menuitemid`, `itemtypeid`, `itemname`, `itemprice`, `itemtoppings`, `imagesource`) VALUES
(1, 1, 'Veg Margerita', 100, 'Trademark Dominos Sauce, Cheese', 'slider-1.jpg'),
(2, 1, 'Veg Country Special', 100, 'Trademark Dominos Sauce, Cheese, Capsicum, Tomato', 'slider-2.jpg'),
(3, 1, 'Veg Fresh Veggie', 100, 'Trademark Dominos Sauce, Cheese, Capsicum, Onion', 'slider-3.jpg'),
(4, 2, 'Double Cheese Margerita', 150, 'Trademark Dominos Sauce, Cheese and Extra Cheese', 'slider-4.jpg'),
(5, 2, 'Veg Farmhouse', 150, 'Trademark Dominos Sauce, Cheese, Onion, Capsicum, Tomato', 'slider-5.jpg'),
(6, 2, 'Veg Delite', 150, 'Trademark Dominos Sauce, Cheese, Corn, Onion', 'slider-6.jpg'),
(7, 3, 'Chicken Barbeque Pizza', 150, 'Trademark Dominos Sauce, Cheese, Barbequed Chicken', 'slider-10.jpg'),
(8, 3, 'Chicken Barbeque and Onion', 150, 'Trademark Dominos Sauce, Cheese, Chicken, Onion', 'slider-11.jpg'),
(9, 3, 'Double Chicken Cheese', 150, 'Trademark Dominos Sauce, Cheese, Chicken and Double Cheese', 'slider-12.jpg'),
(10, 4, 'Spicy Chicken', 200, 'Trademark Dominos Sauce, Cheese, Spicy Chicken Chunks', 'slider-13.jpg'),
(11, 4, 'Zesty Chicken', 200, 'Trademark Dominos Sauce, Cheese, Zesty Chicken Chunks', 'slider-14.jpg'),
(12, 4, 'Supreme Chicken', 200, 'Trademark Dominos Sauce, Cheese, Grilled Chicken Pieces, Onion', 'slider-15.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `menutype`
--

CREATE TABLE IF NOT EXISTS `menutype` (
  `menutypeid` int(3) NOT NULL AUTO_INCREMENT,
  `menuname` varchar(50) NOT NULL,
  PRIMARY KEY (`menutypeid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `menutype`
--

INSERT INTO `menutype` (`menutypeid`, `menuname`) VALUES
(1, 'Pizzas    '),
(2, 'Dessert');

-- --------------------------------------------------------

--
-- Table structure for table `orderitem`
--

CREATE TABLE IF NOT EXISTS `orderitem` (
  `orderitemid` int(3) NOT NULL AUTO_INCREMENT,
  `customizeitemid` int(3) NOT NULL,
  `orderid` int(3) NOT NULL,
  PRIMARY KEY (`orderitemid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `ordertable`
--

CREATE TABLE IF NOT EXISTS `ordertable` (
  `orderid` int(3) NOT NULL AUTO_INCREMENT,
  `userid` int(3) NOT NULL,
  `totalbill` decimal(5,2) NOT NULL,
  `tax` decimal(5,2) NOT NULL,
  `grandtotal` decimal(5,2) NOT NULL,
  `discount` int(3) NOT NULL,
  `orderdate` varchar(50) NOT NULL,
  `orderstatus` varchar(50) NOT NULL,
  PRIMARY KEY (`orderid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=107 ;

--
-- Dumping data for table `ordertable`
--

INSERT INTO `ordertable` (`orderid`, `userid`, `totalbill`, `tax`, `grandtotal`, `discount`, `orderdate`, `orderstatus`) VALUES
(1, 1, '0.00', '0.00', '0.00', 0, '', ''),
(104, 0, '150.00', '10.50', '160.50', 0, '2013-09-30', 'Confirmed'),
(105, 1, '450.00', '31.50', '481.50', 0, '2013-09-30', 'Confirmed'),
(106, 1, '225.00', '31.50', '256.50', 225, '2013-09-30', 'Confirmed');

-- --------------------------------------------------------

--
-- Table structure for table `usert`
--

CREATE TABLE IF NOT EXISTS `usert` (
  `userid` int(3) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) NOT NULL,
  `mobileno` int(13) NOT NULL,
  `city` varchar(50) NOT NULL,
  `area` varchar(50) NOT NULL,
  `building` varchar(50) NOT NULL,
  `house` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `usert`
--

INSERT INTO `usert` (`userid`, `username`, `mobileno`, `city`, `area`, `building`, `house`, `password`) VALUES
(1, 'krupal', 998888, 'pune', 'aundh', 'jagdish nagar society', '1', 'krupal'),
(2, 'manas', 987654123, 'pune', 'aundh', 'aundh gaon', '1', 'manas');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
