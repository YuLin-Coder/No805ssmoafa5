const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmoafa5/",
            name: "ssmoafa5",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmoafa5/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "乐购游戏商城系统"
        } 
    }
}
export default base
