Feature: LoginFeature 
	this feature is so fuck

    
Scenario Outline: Login is correct with outline
	Given Entro a la pagina de Login
	When Ingreso la informacion de "<usuario>" y "<password>" en la pantalla de login
	And Doy clic en el boton login 
	Then Yo deberia ver el formulario usuario
	Examples:
		| usuario | password |
		| admin	  | superAdmin |
