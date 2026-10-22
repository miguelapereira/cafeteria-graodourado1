document.addEventListener('DOMContentLoaded', () => {
    const themeToggleBtn = document.getElementById('themeToggle');

    // Aplica o tema na página e atualiza o ícone do botão
    function applyTheme(theme) {
        document.documentElement.setAttribute('data-bs-theme', theme);
        localStorage.setItem('theme', theme);

        if (themeToggleBtn) {
            themeToggleBtn.textContent = theme === 'dark' ? '☀️' : '🌙';
            themeToggleBtn.setAttribute('title', theme === 'dark' ? 'Ativar tema claro' : 'Ativar tema escuro');
        }
    }

    // Inicializa o tema salvo no localStorage
    const savedTheme = localStorage.getItem('theme') || 'light';
    applyTheme(savedTheme);

    // Evento de clique para alternar o tema
    if (themeToggleBtn) {
        themeToggleBtn.addEventListener('click', () => {
            const currentTheme = document.documentElement.getAttribute('data-bs-theme');
            const newTheme = currentTheme === 'dark' ? 'light' : 'dark';
            applyTheme(newTheme);
        });
    }

    // Preenchimento automático do produto no modal de pedidos
    const modalPedido = document.getElementById('modalPedido');
    if (modalPedido) {
        modalPedido.addEventListener('show.bs.modal', (event) => {
            const button = event.relatedTarget;
            if (button && button.hasAttribute('data-produto')) {
                const produtoNome = button.getAttribute('data-produto');
                const selectProduto = document.getElementById('produtoPedido');
                if (selectProduto) {
                    selectProduto.value = produtoNome;
                }
            }
        });
    }
});