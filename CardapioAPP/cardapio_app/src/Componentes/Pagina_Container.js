import React from "react";
import Logo from "../img/Unknown-Logo.png";

function Pagina_Container(){

    return (
        <>
            <header>
                <nav id = 'Menu'>
                    <ul id = 'Menu_List'>
                        <li><img src ={Logo} alt = "Logo"/></li>
                        <li><a href='#'>Home</a></li>
                        <li><a href='#'>Cadastro de Receitas</a></li>
                        <li><a href='#'>Votação do Cardápio</a></li>
                    </ul>
                </nav>
            </header>
            <footer id = "Rodape">
                <p>Gustavo de Cássio Vasselai</p>
                <p>João Armando Alves Neto</p>
                <p>Otávio Viñe Masella</p>
                <p>Pedro Henrique Alves Silva</p>
            </footer>
        </>
    )
}

export default Pagina_Container