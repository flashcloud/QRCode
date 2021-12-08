class QrCodeGrailsPlugin {
    def version = "0.2.0"
    def grailsVersion = "2.0 > *"

    def title = "QRCode Plugin"
    def author = "Ly Tung"
    def authorEmail = "tyanhly@gmail.com"
    def description = 'Allows your Grails application to create QRCode image which you can put your logo to this image. \n' +
            'It depends on this library, kenglxn/QRGen:https://github.com/kenglxn/QRGen'
    def organization = [name: 'KiSS Concept', url: 'http://kiss-concept.com']

    def documentation = "http://grails.org/plugin/qr-code"
    
    def license = "APACHE"
    def issueManagement = [system: 'GITHUB', url: 'https://github.com/tyanhly/QRCode/issues']
    def scm = [url: 'https://github.com/tyanhly/QRCode']
}

