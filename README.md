# praticando-git

git init 
- inicia o projeto no git

git add . 
- adiciona todos os arquivos que estão prontos para commit

git add <File> 
- adiciona o arquivo desejado que esta pronto para commit

git status 
- mostra o estado das remificações (alterações) antes dos commits
  
git commit -m "mensagem do commit" 
- salva as alterações no histórico

git diff
- Mostra o que foi alterado, o que tem de alteração na ramificação
  
git push origin main/master 
- sobe as alterações para o projeto principal

git log 
- mostra o histórico dos commits

git restore <File> 
- caso eu tenha add as alterações mas foi um engano e não quero commitar, isso descartará as alterações.

git branch 
- mostra todas as branchs 

git checkout -b <nome-da-minha-branch> 
- Cria uma nova branch a partir do histórico da branch em que estamos.

git checkout <master> 
- esse código é para mudar de uma branch para outra

Estamos na branch "master " -- git merge <nome-da-minha-branch> 
- merge de ramificações, mescla ramificações

git remote add origin <URL> 
- adicionando um repositório global

git push origin <nome-da-minha-branch> 
- Manda tudo o que estiver na branch local (Qualquer uma que deseja) para a global

git pull origin <nome-da-minha-branch> 
- manda tudo do repositório global para o meu local

git ls-files 
- mostra todos os arquivos da branch

git fetch 
- atualiza o novo histórico local de acordo com o histórico salvo la no repositório remoto.
- sicronização do global com o local
