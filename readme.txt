创建版本库：git init
把文件添加到仓库：git add filename
把文件提交到仓库：git commit -m "备注"
查看仓库当前状态：git status
查看文件修改：git diff filename
查看提交日志：git log
回退到上一个版本：git reset --hard HEAD^
回退到某个版本：git reset --hard 版本号
查看历史命令：git reflog
查看工作区和版本库里面最新版本的区别：git diff HEAD -- filename
撤销修改：git checkout -- filename
{
场景1：当你改乱了工作区某个文件的内容，想直接丢弃工作区的修改时，用命令git checkout -- file。

场景2：当你不但改乱了工作区某个文件的内容，还添加到了暂存区时，想丢弃修改，分两步，第一步用命令git reset HEAD file，就回到了场景1，第二步按场景1操作。

场景3：已经提交了不合适的修改到版本库时，想要撤销本次提交，参考版本回退一节，不过前提是没有推送到远程库。	
}
删除文件：删除--git commit (误删恢复：git checkout -- filename)
把本地库的所有内容推送到远程库上(库绑定)：git push -u origin master
推送：git push origin master
克隆远程库：git clone