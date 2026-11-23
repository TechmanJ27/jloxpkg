

class LoxImports {
  public Integer failed = 0;
  public Integer successful = 0;
  
  Boolean validateFile(String path) {
    File f = new File(path);
    if(f.isFile()) { 
      return true;
    }
    return false;
  }

  Boolean validatePkg(String owner, String name) {
    File f = new File(".loxpkg/" + owner + "/" + name);
  }
}
