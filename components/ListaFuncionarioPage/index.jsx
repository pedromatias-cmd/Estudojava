import './styles.css'; 

export default function ListaFuncionarioPage() { 
    const [funcionarios, setFuncionarios] = useState([]); 
    const [carregando, setCarregando] = useState(true); 

    useEffect(() => { 
        async function buscarFuncionarios() { 
            try { 
                const resposta = await api.get('/usuarios'); 
                setFuncionarios(resposta.data); 
            } catch (error) { 
                console.error('Erro ao buscar funcionários:', error); 
                const mensagemDeErro = error.response?.data?.mensagem || 
                    'Erro ao buscar funcionários. Tente novamente mais tarde.'; 
                toast.error(mensagemDeErro);  
            } finally { 
                setCarregando(false); 
            }   
        } 
        buscarFuncionarios(); 
    }, []);
    
    if (carregando) { 
        return <div>Carregando funcionarios...</div>;
    }    
    
    return( 
        <> 
        </>
    );
}