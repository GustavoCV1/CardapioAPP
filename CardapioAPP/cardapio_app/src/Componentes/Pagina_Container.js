import React from "react";
import Logo from "../img/Unknown-Logo.png";

function Pagina_Container(){

    return (
        <>
            <nav id = 'Menu'>
                <ul id = 'Menu_List'>
                    <li><img src ={Logo} alt = "Logo"/></li>
                    <li><a href='#'>Home</a></li>
                    <li><a href='#'>Cadastro de Receitas</a></li>
                    <li><a href='#'>Votação do Cardápio</a></li>
                </ul>
            </nav>
        </>
    )
}

export default Pagina_Container