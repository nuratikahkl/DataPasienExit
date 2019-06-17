-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 17 Jun 2019 pada 02.10
-- Versi Server: 10.1.19-MariaDB
-- PHP Version: 5.6.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `datapasienexit`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `data_pasien`
--

CREATE TABLE `data_pasien` (
  `no_rm` int(20) NOT NULL,
  `no_k` int(20) NOT NULL,
  `tanggal_kematian` varchar(255) NOT NULL,
  `alamat_kematian` varchar(255) NOT NULL,
  `nama_pasien` varchar(255) NOT NULL,
  `jk` enum('Laki-Laki','Perempuan','','') NOT NULL,
  `umur` int(11) NOT NULL,
  `dokter` varchar(200) NOT NULL,
  `penyebab_kematian` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `data_pasien`
--

INSERT INTO `data_pasien` (`no_rm`, `no_k`, `tanggal_kematian`, `alamat_kematian`, `nama_pasien`, `jk`, `umur`, `dokter`, `penyebab_kematian`) VALUES
(1857, 12862, '2019-01-28', 'jalan kestuari nomor 5', 'liliana', 'Perempuan', 12, 'dr.anita', 'dbd'),
(123129, 17530, '2017-01-16 20:24:35', 'Jalan Kemerdekaan nomor 19', 'Jubaedah', 'Perempuan', 40, 'dr. Anggita Prayana,.Sp.JP', 'gagal jantung');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_pasien`
--
ALTER TABLE `data_pasien`
  ADD PRIMARY KEY (`no_rm`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
