<?php

/*
|--------------------------------------------------------------------------
| Application Routes
|--------------------------------------------------------------------------
|
| Here is where you can register all of the routes for an application.
| It's a breeze. Simply tell Laravel the URIs it should respond to
| and give it the controller to call when that URI is requested.
|
*/

Route::get('/', function () {
	
    return view('welcome');
});

Route::auth();

Route::get('/home', 'HomeController@index');
Route::get('/accueil', function () {
	$data=[
	  'prenom' => 'Mamadou Cherif',
	  'nom' => 'KASSE'
	];
    return view('/accueil',$data);
});
Route::get('/test1', function () {
    return view('test1');
});
Route::get('/contacts', function () {
    return view('contacts');
});
Route::get('/test2', function () {
    return view('test2');
});
Route::get('/Bienvenue', function () {
	$data=[
	  'prenom' => 'Mamadou Cherif',
	  'nom' => 'KASSE'
	];
    return view('/Bienvenue',$data);
});
Route::get('index','test@index');
Route::post('store','test@store');
Route::get('test1','test@show');


