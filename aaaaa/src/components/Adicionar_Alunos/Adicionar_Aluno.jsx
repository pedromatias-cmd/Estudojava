import { useState } from "react"; 
import './style.css' 

export default function AdicionarAluno() { 
    const [nome, setNome] = useState('') 
    const [email, setEmail] = useState('') 
    const [listaAlunos, setListaAlunos] = useState([]) 

    const addAluno = (event) => { 
        event.preventDefault() 
        if (nome && email) { 
            setListaAlunos([...listaAlunos, { nome: nome, email: email }]) 
            setNome('') 
            setEmail('') 
        } 
    } 

    return ( 
        <div>  
            <h2>Adicionar Aluno</h2> 
            <form onSubmit={addAluno}> 
                <input 
                    type="text" 
                    placeholder="nome" 
                    value={nome} 
                    onChange={(e) => setNome(e.target.value)} 
                /> 
                <input 
                    type="email" 
                    placeholder="E-mail" 
                    value={email} 
                    onChange={(e) => setEmail(e.target.value)} 
                /> 
                <button type="submit">Adicionar</button>
            </form>

            <ul>
                {listaAlunos.map((aluno, index) => (
                    <li key={index}>{aluno.nome} - {aluno.email}</li>
                ))}
            </ul>
        </div>
    ) 
} 