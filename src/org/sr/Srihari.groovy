package org.sr


class Srihari implements Serializable {
    def config
    def script
    
    Srihari(script, config) {
      this.script = script
      this.config = config
    }
    
    def srihariecho() {
      this.script.echo "$config"
    }
}
