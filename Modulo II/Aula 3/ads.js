const hello = new Promise((res, rej) =&gt; {
  res(&#39;Olá, &#39;);
  });
  async function saudacoes() {
  const name = await hello
  .then(res =&gt; res + &quot;tudo &quot;)
  .then(res =&gt; res + &quot;bem?&quot;)
  .catch(e =&gt; console.log(e.message))
  return name;
  }
  await saudacoes();