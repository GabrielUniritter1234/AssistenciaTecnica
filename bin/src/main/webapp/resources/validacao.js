validarSenha() 
if ("#{UsuarioView.usuario.senhaUsuario" != "#{UsuarioView.usuario.confSenhaUsuario}") {
    alert("SENHAS DIFERENTES!\\nFAVOR DIGITAR SENHAS IGUAIS");
    return false;
 } 
else {
	return true;
  }
