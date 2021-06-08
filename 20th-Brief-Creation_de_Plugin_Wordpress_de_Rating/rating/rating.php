<?php

/**
 * The plugin bootstrap file
 *
 * This file is read by WordPress to generate the plugin information in the plugin
 * admin area. This file also includes all of the dependencies used by the plugin,
 * registers the activation and deactivation functions, and defines a function
 * that starts the plugin.
 *
 * @link              https://github.com/YassineCherkaoui
 * @since             1.0.0
 * @package           Rating
 *
 * @wordpress-plugin
 * Plugin Name:       Rating
 * Plugin URI:        https://github.com/YassineCherkaoui/Creation_de_Plugin_Wordpress_de_Rating
 * Description:       This is a short description of what the plugin does. It's displayed in the WordPress admin area.
 * Version:           1.0.0
 * Author:            Cherkaoui Yassine
 * Author URI:        https://github.com/YassineCherkaoui
 * License:           GPL-2.0+
 * License URI:       http://www.gnu.org/licenses/gpl-2.0.txt
 * Text Domain:       rating
 * Domain Path:       /languages
 */

// If this file is called directly, abort.
if ( ! defined( 'WPINC' ) ) {
	die;
}

define( 'RATING_VERSION', '1.0.0' );

/**
 * The code that runs during plugin activation.
 * This action is documented in includes/class-rating-activator.php
 */
function activate_rating() {
	require_once plugin_dir_path( __FILE__ ) . 'Plugin.php';
	Rating_Activator::activate();
}

/**
 * Begins execution of the plugin.
 *
 * Since everything within the plugin is registered via hooks,
 * then kicking off the plugin from this point in the file does
 * not affect the page life cycle.
 *
 * @since    1.0.0
 */
function run_rating() {

	$plugin = new Rating();
	$plugin->run();

}
run_rating();
