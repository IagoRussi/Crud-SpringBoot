fetch('http://localhost:8080/produtos')
    .then(response => response.json())
    .then(listaProdutos => {
        const container = document.getElementById('container');
        listaProdutos.forEach(produto => {
            const card = document.createElement('div');
            card.className = 'card';
            card.innerHTML = `
            <p>Nome do Produto: <span style="font-weight: bold;"> ${produto.nomeProduto}</span> </p>
            <p>Preço do Produto: R$ ${produto.preco}</p>
            <p>Id do Produto: ${produto.id}</p>
            `;
            container.appendChild(card);
            card.add
        })
    }

    )