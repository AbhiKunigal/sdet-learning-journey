//Setup & Info
git config --global user.name "Your Name"
git config --global user.email "you@example.com"
git config --list
git --version


//Create // Clone Repos
git init                 # start a new repo
git clone <url>          # copy a remote repo


//Daily Workflow (the core loop)
git status               # see what's changed
git add <file>           # stage a file
git add .                # stage everything
git commit -m "message"  # save changes
git commit <file> -m "message"  # just commit if there are any changes are made
git commit -a -m "message"  # if you want to commit all the files
git push                 # upload to remote
git pull                 # fetch + merge from remote
git log --oneline        # recent commit

//diiference between Files:
git diff <file>          # difference between source and destination (workspace vs stagging)
git diff Head <file>     # difference between woring directory and local repository (workspace vs stagging)
git diff --staged Head <file>     # difference between stage and local repository (workspace vs stagging)
git diff <commiID> <file> # difference between rquired commit id and local repository 
git diff --staged <commiID> <file> # difference between rquired commit id and staggng 
git diff <commiID> <commiID>  # difference between rquired commit ids 
git diff <Branch1> <Branch2>  # difference between 2 branches
git diff <Branch1> origin/<Branch2>  # difference between local and remote repository

//Git removing the files
git rm <file>           # remove the file in staging and working directory
git rm -r .             # remove all the file
git rm --cached <file>  # remove the file in staging
rm <file>               # remove the file local
git ls-files            #check the file in staggig

//undo changes in working directory
git checkout -- <file>  #To remove the unstaged changes in tracked files of working directory

//Reset command
git reset --soft <commiID>    # undo commit, keep staged file and working direc
git reset --mixed <commiID>   # undo commit, keep only working direc
git reset --hard <commiID>    # undo commit, delete all
git reset                  # remove the changes in stagging area

//Branching
git branch               # list branches
git branch <name>        # create branch
git checkout <name>      # switch branch
git checkout -b <name>   # create + switch
git merge <branch>       # merge branch into current
git branch -d <name>     # delete branch

//Modern alternative:
git switch <name>
git switch -c <name>


//Viewing History
git log                  # full commit history
git log --oneline --graph --all
git show <commit>


//Undoing Things (aka panic commands )
git restore <file>              # discard file changes
git restore --staged <file>     # unstage file
git reset --soft HEAD~1         # undo commit, keep changes
git reset --hard HEAD~1         # undo commit, delete changes (danger!)
git revert <commit>             # undo via new commit (safe)


//Remote Repos
git remote -v
git remote add origin <url>
git push -u origin main
git fetch


//Stashing (save work temporarily)
git stash
git stash list
git stash apply
git stash pop


//Tags (releases)
git tag
git tag v1.0
git push origin v1.0
