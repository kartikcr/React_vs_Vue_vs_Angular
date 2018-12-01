describe('The Home Page', function () {
  it('successfully loads', function() {
    cy.visit('http://localhost:3000')
 cy.get('#b1').then(($btn) => {})
 cy.get('#t1').then(($t1) => {})
 //cy.get('d1').then(($divblc1) => {})
 cy.get('div').then(($random) =>{})
 cy.get("#A"+"1_"+"title").then(($texty1) => {})
 cy.get("#A"+"1_"+"author").then(($texty2) => {})
 cy.get("#A"+"1_"+"article").then(($texty3) => {})
 cy.get("#A"+"2_"+"title").then(($texty1) => {})
 cy.get("#A"+"2_"+"author").then(($texty2) => {})
 cy.get("#A"+"2_"+"article").then(($texty3) => {})

/*cy.get('#d1').should(($d1) => {
const $divs = $d1.find('div')
expect($divs.eq(0)).to.contain('data.title')
})*/
//cy.get('#d1').get('#d2').contains('#txt1')
//cy.get('#d1').then(($d1 => {})
//cy.get('#d1').get('#d2').get('#txt1').then(($txt1) => {})
//cy.get('div h2#txt2').then(($txt2) => {})
//cy.get('div h3#txt3').then(($txt3) => {})
//cy.get('button').click({ position: 'topLeft' }) 
//cy.get('input[name=TaskContent]').type(`${text}`)
})
})