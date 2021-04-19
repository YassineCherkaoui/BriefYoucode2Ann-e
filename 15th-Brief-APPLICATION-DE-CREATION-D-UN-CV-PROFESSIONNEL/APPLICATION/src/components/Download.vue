<template>
  <div>
    <header>
      <h1>Download Your Resumer</h1>
    </header>
    <main>
      <section>
        <article>
          <h2>Just Click on button bellow</h2>
          <p>Thanks for choosing out platform</p>
          <div class="actions">
            <button
              type="button"
              id="btn1"
              class="primary"
              @click="generateReport"
            >
              OK
            </button>
            <button type="button" id="btn2" class="secondary">Cancel</button>
          </div>
        </article>
      </section>
    </main>
    <vue-html2pdf
      :show-layout="false"
      :float-layout="true"
      :enable-download="true"
      :preview-modal="true"
      :paginate-elements-by-height="1800"
      filename="mycv"
      :pdf-quality="2"
      :manual-pagination="false"
      pdf-format="a2"
      pdf-orientation="landscape"
      pdf-content-width="100%"
      @progress="onProgress($event)"
      @hasStartedGeneration="hasStartedGeneration()"
      @hasGenerated="hasGenerated($event)"
      ref="html2Pdf"
    >
      <section slot="pdf-content">
        <div class="download">
          <cvPrev></cvPrev>
        </div>
      </section>
    </vue-html2pdf>
  </div>
</template>

<script>
import cvPrev from "@/components/CvPrev.vue";
import VueHtml2pdf from "vue-html2pdf";

export default {
  name: "download",
  data() {
    return {};
  },
  components: {
    cvPrev,
    VueHtml2pdf,
  },
  methods: {
    generateReport() {
      this.$refs.html2Pdf.generatePdf();
    },
  },
};
</script>

<style lang="scss">
.download {
  .redirectBtn {
    display: none;
  }
}
@import url(https://fonts.googleapis.com/css?family=Ubuntu+Condensed);
@import url(https://fonts.googleapis.com/css?family=Raleway:400);
html {
  -ms-box-sizing: border-box;
  -moz-box-sizing: border-box;
  -webkit-box-sizing: border-box;
  box-sizing: border-box;
}

*,
*:before,
*:after {
  -ms-box-sizing: inherit;
  -moz-box-sizing: inherit;
  -webkit-box-sizing: inherit;
  box-sizing: inherit;
}

* {
  margin: 0;
  padding: 0;
}

body {
  font-family: "Raleway", Verdana, sans-serif;
  font-weight: 400;
  font-size: 0.75rem;
  line-height: 1.125rem;
  color: #666;
}

header,
body {
  background-color: #e7ecf1;
}

header,
main,
footer {
  padding: 20px 5%;
}

main {
  min-height: calc(100vh - 117px - 58px);
  position: relative;
  overflow: hidden;
}

footer {
  color: #fff;
  background-color: #0079a9;
  text-align: center;
}

section {
  padding: 50px 20%;
  margin: 0 auto;
}

h1,
h2 {
  font-family: "Ubuntu Condensed", Helvetica, Arial, sans-serif;
}

h1 {
  color: #008cc3;
  font-size: 32px;
  line-height: 36px;
  text-transform: uppercase;
  text-align: center;
  border-bottom: 1px solid lightblue;
  padding: 20px 0;
}

h2 {
  padding-bottom: 1rem;
  font-style: italic;
}

a:link,
a:visited {
  color: #e7ecf1;
}
a:hover,
a:active {
  color: #43caff;
}
a:active {
  color: #009edc;
}

button {
  -webkit-appearance: button;
  font-family: "Ubuntu Condensed", Helvetica, Arial, sans-serif;
  color: #fff;
  font-size: 1.125rem;
  line-height: 1.25rem;
  text-transform: uppercase;
  text-decoration: none;
  vertical-align: middle;
  border: 0;
  outline: 0;
  transform: translate3d(0, 0, 0);
  overflow: hidden;
  cursor: pointer;
  display: inline-block;
  min-height: 32px;
  padding: 5px 30px;
  margin: 8px;
}
button:hover,
button:focus,
button:active {
  outline: 0;
  text-decoration: none;
}

button.primary {
  background-color: #009edc;
}
button.primary:hover,
button.primary:focus {
  background-color: #00b0f6;
}
button.primary:active {
  background-color: #008cc3;
}

button.secondary {
  color: #222731;
  background-color: #d9d9d6;
}
button.secondary:hover,
button.secondary:focus {
  background-color: #cdcdc9;
}
button.secondary:active {
  background-color: #e5e5e3;
}

.actions {
  margin-top: 20px;
  text-align: center;
}

.popups {
  opacity: 0;
  position: absolute;
  color: #fff;
  background-color: #009edc;
  padding: 10px 20px;
  border-radius: 2px;
  border: 1px solid #008cc3;
  box-shadow: 0 0 6px 0 #005576;
  transition-property: right;
  transition-delay: 0.1s;
  transition-duration: 2s;
  transition-timing-function: ease-in-out;
}
.popups#pop1 {
  top: 0;
  right: -10%;
}
.popups#pop2 {
  bottom: 15%;
  right: -15%;
}
</style>
