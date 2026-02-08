## Navigation
pwd            # show current directory
ls             # list files
ls -l          # detailed list
ls -a          # show hidden files
cd folder/     # go into folder
cd ..          # go back one level
cd ~           # go to home

## Files & Folders
mkdir folder          # create folder
mkdir -p a/b/c        # nested folders
rmdir folder          # delete empty folder
touch file.md         # create file
mv a.txt b/           # move file
mv a.txt b.txt        # rename file
cp a.txt b/           # copy file
rm file.txt           # delete file
rm -r folder/         # delete folder (careful)

## View & Edit
cat file.md           # view file
less file.md          # scroll view
nano file.md          # edit (easy)
vim file.md           # edit (advanced)


## Exit editors:
nano → Ctrl + X, then Y, Enter
vim → Esc :wq

## Search
find . -name file.md
grep "text" file.md

## Permissions
chmod +x script.sh
