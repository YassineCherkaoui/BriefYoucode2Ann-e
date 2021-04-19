<template>
  <div class="CV">
    <div class="container">
      <div class="personnelInfo">
        <h2>{{ description }}</h2>
        <h1>
          {{ name }}
          <button type="button" class="btn btn-primary" @click="goToDownload">
            Go to download page
          </button>
        </h1>

        <div class="info">
          <p><b-icon icon="chat-left-dots"></b-icon> {{ email }}</p>
          <p><b-icon icon="telephone-fill"></b-icon> {{ phone }}</p>
          <p><b-icon icon="house-door-fill"></b-icon> {{ adress }}</p>
          <p><b-icon icon="github"></b-icon> {{ github }}</p>
        </div>
      </div>
      <div class="experience">
        <h3>EXPERIENCE</h3>
        <div class="line"></div>
        <div>
          <div class="contents">
            <h4>{{ company }}</h4>
            <h5>
              {{ post }} |
              <span> {{ from }} - {{ to }} </span>
            </h5>
            <p>{{ postdisc }}</p>
          </div>
          <br />
        </div>
        <br />
      </div>

      <div class="experience">
        <h3>EDUCATION</h3>
        <div class="line"></div>

        <div>
          <div class="contents">
            <h4>{{ university }}</h4>
            <h5>
              {{ branch }} |
              <span>{{ from }} - {{ to }}</span>
            </h5>
          </div>
          <br />
        </div>
      </div>

      <div class="personnelInfo">
        <h1>ABOUT ME</h1>

        <p class="aboutMe">{{ about }}</p>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "ResumeView",
  data() {
    return {
      name: this.$store.state.name,
      description: this.$store.state.desc,

      email: this.$store.state.email,
      phone: this.$store.state.phone,
      adress: this.$store.state.adress,
      github: this.$store.state.github,

      company: this.$store.state.company,
      post: this.$store.state.post,
      postdisc: this.$store.state.postdisc,

      from: this.$store.state.from,
      to: this.$store.state.to,

      university: this.$store.state.university,

      branch: this.$store.state.branch,

      about: this.$store.state.about,
    };
  },
  methods: {
    goToDownload: function () {
      this.$router.push({ path: "download" });
    },
  },
};
</script>

<style lang="scss">
@import url("https://fonts.googleapis.com/css2?family=Lato:wght@100;300;400;700;900&display=swap");

$primary_font: "Lato", sans-serif;
$primary_color: black;
.CV {
  font-family: $primary_font;
  .personnelInfo {
    padding: 2% 8%;
    background-color: black;
    h2,
    h1 {
      color: white;
    }
    h2,
    h1 {
      font-weight: bold;
    }
    h2 {
      font-size: 25px;
    }
    h1 {
      font-size: 60px;
    }
    .info {
      display: flex;
      justify-content: space-between;
      p {
        color: white;
        font-size: 20px;
        svg {
          margin-right: 15px;
        }
      }
    }
    .aboutMe {
      color: white;
    }
  }
  .container {
    max-width: 100%;
  }
  .experience {
    background-color: #f9f9f9;
    padding: 2% 8%;
    h3 {
      font-weight: bold;
      color: $primary_color;
      font-size: 40px;
    }
    .line {
      &::after {
        border-radius: 0;
        height: 2px;
        background-color: black;
      }
    }
    .contents {
      h4 {
        color: $primary_color;
        font-weight: bold;
      }
      h5 {
        color: $primary_color;
        font-weight: bold;
        span {
          color: $primary_color;
          font-weight: 300;
        }
      }
      p {
        color: black;
        font-weight: bold;
      }
    }
    .skills {
      display: flex;
      justify-content: space-around;
      flex-wrap: wrap;
      li {
        list-style: none;
        font-weight: bold;
        font-size: 25px;
      }
    }
  }
}
</style>
