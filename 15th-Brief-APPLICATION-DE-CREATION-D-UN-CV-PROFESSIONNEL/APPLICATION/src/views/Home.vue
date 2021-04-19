<template>
  <div>
    <form class="container">
      <div class="form-group">
        <label for="name">Full Name</label>
        <input
          type="text"
          class="form-control"
          id="name"
          aria-describedby="emailHelp"
          v-model="name"
        />
      </div>
      <div class="form-group">
        <label for="description">Description</label>
        <textarea
          class="form-control"
          id="description"
          rows="3"
          v-model="desc"
        ></textarea>
      </div>

      <div class="form-group">
        <label for="email">Email</label>
        <input type="email" class="form-control" id="email" v-model="email" />
      </div>
      <div class="form-group">
        <label for="phone">Phone</label>
        <input type="email" class="form-control" id="phone" v-model="phone" />
      </div>
      <div class="form-group">
        <label for="address">Address</label>
        <input
          type="email"
          class="form-control"
          id="address"
          v-model="adress"
        />
      </div>
      <div class="form-group">
        <label for="github">Github</label>
        <input type="email" class="form-control" id="github" v-model="github" />
      </div>

      <div class="form-group">
        <label for="COMPANY">COMPANY</label>
        <input
          type="text"
          class="form-control"
          id="COMPANY"
          v-model="company"
        />
      </div>
      <div class="form-group">
        <label for="POST">POST</label>
        <input type="text" class="form-control" id="POST" v-model="post" />
      </div>
      <div class="form-group">
        <label for="POST_DESC">POST DESC</label>
        <input
          type="text"
          class="form-control"
          id="POST_DESC"
          v-model="postdisc"
        />
      </div>

      <div class="row">
        <div class="col-md">
          <div class="form-group">
            <label for="FROM">FROM</label>
            <input
              type="number"
              class="form-control"
              id="FROM"
              v-model="from"
            />
          </div>
        </div>
        <div class="col-md">
          <div class="form-group">
            <label for="TO">TO</label>
            <input type="number" class="form-control" id="TO" v-model="to" />
          </div>
        </div>
      </div>

      <div class="form-group">
        <label for="COMPANY">UNIVERSITY</label>
        <input
          type="text"
          class="form-control"
          id="COMPANY"
          v-model="university"
        />
      </div>
      <div class="form-group">
        <label for="POST">BRANCH</label>
        <input type="text" class="form-control" id="POST" v-model="branch" />
      </div>

      <div class="row">
        <div class="col-md">
          <div class="form-group">
            <label for="FROM">FROM</label>
            <input
              type="number"
              class="form-control"
              id="FROM"
              v-model="from"
            />
          </div>
        </div>
        <div class="col-md">
          <div class="form-group">
            <label for="TO">TO</label>
            <input type="number" class="form-control" id="TO" v-model="to" />
          </div>
        </div>
      </div>

      <div class="form-group">
        <label for="about">about me</label>
        <textarea
          class="form-control"
          id="about"
          rows="3"
          v-model="about"
        ></textarea>
      </div>

      <button class="btn btn-primary" @click.prevent="submit">SUBMIT</button>

      <!-- {{ myName }} <br>
        {{ myDesc }} -->
    </form>
  </div>
</template>

<script>
export default {
  name: "NameAndDesc",
  data() {
    return {
      myName: "",
      myDesc: "",
      myEmail: "",
      myPhone: "",
      myAdress: "",
      myGitHub: "",
      myCompany: "",
      myPost: "",
      myPostdisc: "",
      myFrom: "",
      myTo: "",
      myUniversity: "",
      myBranch: "",
      myAbout: "",
    };
  },
  computed: {
    // this.$store.state.name = this.name
    // this.$store.state.desc = this.desc
    name: {
      get() {
        return this.$store.state.name;
      },
      set(value) {
        this.$store.commit("setName", value);
      },
    },
    desc: {
      get() {
        return this.$store.state.desc;
      },
      set(value) {
        this.$store.commit("setDesc", value);
      },
    },
    email: {
      get() {
        return this.$store.state.email;
      },
      set(value) {
        this.$store.commit("setEmail", value);
      },
    },
    phone: {
      get() {
        return this.$store.state.phone;
      },
      set(value) {
        this.$store.commit("setPhone", value);
      },
    },
    adress: {
      get() {
        return this.$store.state.adress;
      },
      set(value) {
        this.$store.commit("setAdress", value);
      },
    },
    github: {
      get() {
        return this.$store.state.github;
      },
      set(value) {
        this.$store.commit("setGitHub", value);
      },
    },
    company: {
      get() {
        return this.$store.state.company;
      },
      set(value) {
        this.$store.commit("setCompany", value);
      },
    },
    post: {
      get() {
        return this.$store.state.post;
      },
      set(value) {
        this.$store.commit("setPost", value);
      },
    },
    postdisc: {
      get() {
        return this.$store.state.postdisc;
      },
      set(value) {
        this.$store.commit("setPostdisc", value);
      },
    },
    from: {
      get() {
        return this.$store.state.from;
      },
      set(value) {
        this.$store.commit("setFrom", value);
      },
    },
    to: {
      get() {
        return this.$store.state.to;
      },
      set(value) {
        this.$store.commit("setTo", value);
      },
    },

    university: {
      get() {
        return this.$store.state.university;
      },
      set(value) {
        this.$store.commit("setUniversity", value);
      },
    },

    branch: {
      get() {
        return this.$store.state.branch;
      },
      set(value) {
        this.$store.commit("setBranch", value);
      },
    },

    about: {
      get() {
        return this.$store.state.about;
      },
      set(value) {
        this.$store.commit("setAbout", value);
      },
    },
  },
  methods: {
    submit: function () {
      this.myName = this.$store.state.name;
      this.myDesc = this.$store.state.desc;
      this.myEmail = this.$store.state.email;
      this.myPhone = this.$store.state.phone;
      this.myAdress = this.$store.state.adress;
      this.myGitHub = this.$store.state.github;

      this.myCompany = this.$store.state.company;
      this.myPost = this.$store.state.post;
      this.myPostdisc = this.$store.state.postdisc;
      this.myFrom = this.$store.state.from;
      this.myTo = this.$store.state.to;

      this.myUniversity = this.$store.state.university;
      this.myBranch = this.$store.state.branch;

      this.myAbout = this.$store.state.about;

      this.$router.push({ path: "CvPrev" });
    },
  },
};
</script>

<style></style>
